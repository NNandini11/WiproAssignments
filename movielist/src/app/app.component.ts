import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MaterialModule } from './material.module';
import { CommonModule } from '@angular/common';

interface Movie {
  title: string;
  poster: string;   
  genre: string;
  rating: number;
  description: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MaterialModule, CommonModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'movielist';

  genres: string[] = ['All', 'Drama', 'Family'];

 
  movies: Movie[] = [
    {
      title: 'Aanand',
      poster: 'https://m.media-amazon.com/images/M/MV5BNDQ3ZDFkZmUtZmE2NS00NGEyLWI4YjUtOGIyYWM2OWFhOGU5XkEyXkFqcGc@._V1_.jpg',
      genre: 'Drama',
      rating: 4,
      description: 'A beautiful love story directed by Sekhar Kammula.'
    },
    {
      title: 'Anaganaga',
      poster: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShLBHgVZBuVy1PdVa58wU-ZsO4IzSmHRa47A&s',
      genre: 'Family',
      rating: 3,
      description: 'A heartfelt story about the special bond between a father and his son.'
    },
     { 
      title: 'Aarya', 
      genre: 'Drama', 
      poster:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyCPt16iUzdliV2Mk_bfPgzW1yHZA0jCS0oA&s',
      rating: 4, 
      description: 'An intense story of courage and determination.' 
    },
    {
      title: 'Jersey',
      genre: 'Drama',
      poster: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBc4pq3QTE3KPcSFFJQv2FYTmACuzQN7rT8w&s',
      rating: 5,
      description: 'A heartwarming story of a cricketer making a comeback.'
}
  ];

  selectedGenre: string = 'All';

  get filteredMovies(): Movie[] {
    return this.selectedGenre === 'All'
      ? this.movies
      : this.movies.filter(movie => movie.genre === this.selectedGenre);
  }

  get averageRating(): number {
    if (!this.movies.length) return 0;
    const total = this.movies.reduce((sum, movie) => sum + movie.rating, 0);
    return total / this.movies.length;
  }
}
